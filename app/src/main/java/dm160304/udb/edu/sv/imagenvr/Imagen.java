package dm160304.udb.edu.sv.imagenvr;

import android.os.Parcel;
import android.os.Parcelable;

public class Imagen implements Parcelable {
    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Imagen> CREATOR = new Parcelable.Creator<Imagen>() {
        @Override
        public Imagen createFromParcel(Parcel in) {
            return new Imagen(in);
        }

        @Override
        public Imagen[] newArray(int size) {
            return new Imagen[size];
        }
    };
    private int mId;
    private String mImageName;
    private int mImage;

    public Imagen(int mId, String mImageName, int mImage) {
        this.mId = mId;
        this.mImageName = mImageName;
        this.mImage = mImage;
    }

    protected Imagen(Parcel in) {
        mId = in.readInt();
        mImageName = in.readString();
        mImage = in.readInt();
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmImageName() {
        return mImageName;
    }

    public void setmImageName(String mImageName) {
        this.mImageName = mImageName;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mId);
        dest.writeString(mImageName);
        dest.writeInt(mImage);
    }
}