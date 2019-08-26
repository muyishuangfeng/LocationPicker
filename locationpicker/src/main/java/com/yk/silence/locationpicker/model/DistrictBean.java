package com.yk.silence.locationpicker.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 地区
 */
public class DistrictBean implements Parcelable {

    private String id; /*110101*/
    
    private String name; /*东城区*/

    private DistrictBean(Parcel in) {
        id = in.readString();
        name = in.readString();
    }

    public static final Creator<DistrictBean> CREATOR = new Creator<DistrictBean>() {
        @Override
        public DistrictBean createFromParcel(Parcel in) {
            return new DistrictBean(in);
        }

        @Override
        public DistrictBean[] newArray(int size) {
            return new DistrictBean[size];
        }
    };

    @Override
    public String toString() {
        return name;
    }

    public String getId() {
        return id == null ? "" : id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(id);
        dest.writeString(name);
    }


    public DistrictBean() {
    }


}
