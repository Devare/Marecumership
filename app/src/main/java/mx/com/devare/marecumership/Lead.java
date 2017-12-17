package mx.com.devare.marecumership;


import java.util.UUID;

public class Lead {
    private String mId;
    private String mNombre;
    private String mCargo;
    private String mEmpresa;
    private int mImagen;

    public Lead(String nombre, String titulo, String empresa, int imagen) {
        mId = UUID.randomUUID().toString();
        mNombre = nombre;
        mCargo = titulo;
        mEmpresa = empresa;
        mImagen = imagen;
    }

    public String getmCargo() {
        return mCargo;
    }

    public void setmCargo(String mCargo) {
        this.mCargo = mCargo;
    }

    public String getmEmpresa() {
        return mEmpresa;
    }

    public void setmEmpresa(String mEmpresa) {
        this.mEmpresa = mEmpresa;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public int getmImagen() {
        return mImagen;
    }

    public void setmImagen(int mImagen) {
        this.mImagen = mImagen;
    }

    public String getmNombre() {
        return mNombre;
    }

    public void setmNombre(String mNombre) {
        this.mNombre = mNombre;
    }

    @Override
    public String toString() {
        return "Lead{" +
                "ID ='" + mId + '\'' +
                ", Empresa='" + mEmpresa + '\'' +
                ", Nombre='" + mNombre + '\'' +
                ", Cargo='" + mCargo + '\'' +
                '}';
    }
}
