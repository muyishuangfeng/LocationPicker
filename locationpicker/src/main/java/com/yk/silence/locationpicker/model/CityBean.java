package com.yk.silence.locationpicker.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * 市
 */
public class CityBean implements Parcelable {
    

    private String id; /*110101*/
    
    private String name; /*东城区*/


    private ArrayList<DistrictBean> cityList;

    public CityBean() {
    }

    private CityBean(Parcel in) {
        id = in.readString();
        name = in.readString();
        cityList = in.createTypedArrayList(DistrictBean.CREATOR);
    }

    public static final Creator<CityBean> CREATOR = new Creator<CityBean>() {
        @Override
        public CityBean createFromParcel(Parcel in) {
            return new CityBean(in);
        }

        @Override
        public CityBean[] newArray(int size) {
            return new CityBean[size];
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

    public ArrayList<DistrictBean> getCityList() {
        return cityList;
    }

    public void setCityList(ArrayList<DistrictBean> cityList) {
        this.cityList = cityList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeTypedList(this.cityList);
    }



}
