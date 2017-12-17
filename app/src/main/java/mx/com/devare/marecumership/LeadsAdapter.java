package mx.com.devare.marecumership;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class LeadsAdapter extends ArrayAdapter<Lead> {

    private Lead mLead;
    private ViewHolder mViewHolder;

    public LeadsAdapter(Context context, List<Lead> objects) {
        super(context, 0, objects);
    }

    @Override
    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        // Obtener inflater.
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (null == convertView) { // ¿Existe el view actual?

            // Si no existe, entonces inflarlo con item_list_lead.xml
            convertView = inflater.inflate(R.layout.item_list_lead, parent, false);

            // Creamos un objeto de la clase ViewHolder y hacemos que cada atributo se referencie
            mViewHolder = new ViewHolder(convertView);

            // Asignamos el viewHolder a la vista
            convertView.setTag(mViewHolder);
        } else {  // Si la vista ya existe, recuperamos el viewHolder asociado
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        // Lead actual.
        mLead = getItem(position);

        // Setup.
        inicializarValores();
        return convertView;
    }

    private static class ViewHolder {
        private ImageView iv_avatar;
        private TextView tv_nombre,
                tv_cargo,
                tv_empresa;

        ViewHolder(View convertView) {

            // Instanciamos los recursos de la vista
            iv_avatar = (ImageView) convertView.findViewById(R.id.iv_avatar);
            tv_nombre = (TextView) convertView.findViewById(R.id.tv_nombre);
            tv_cargo = (TextView) convertView.findViewById(R.id.tv_cargo);
            tv_empresa = (TextView) convertView.findViewById(R.id.tv_empresa);
        }
    }

    private void inicializarValores() {
        Glide.with(getContext())
                .load(mLead.getmImagen())
                .apply(RequestOptions.circleCropTransform())
                .into(mViewHolder.iv_avatar);
        mViewHolder.tv_nombre.setText(mLead.getmNombre());
        mViewHolder.tv_cargo.setText(mLead.getmCargo());
        mViewHolder.tv_empresa.setText(mLead.getmEmpresa());
    }
}