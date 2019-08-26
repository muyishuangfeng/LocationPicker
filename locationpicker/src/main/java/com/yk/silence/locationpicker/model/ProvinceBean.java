package com.yk.silence.locationpicker.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * 省份
 */
public class ProvinceBean implements Parcelable {

  private String id; /*110101*/

  private String name; /*东城区*/


  private ArrayList<CityBean> cityList;

  public ProvinceBean() {
  }

  private ProvinceBean(Parcel in) {
    id = in.readString();
    name = in.readString();
    cityList = in.createTypedArrayList(CityBean.CREATOR);
  }

  public static final Creator<ProvinceBean> CREATOR = new Creator<ProvinceBean>() {

    @Override
    public ProvinceBean createFromParcel(Parcel in) {
      return new ProvinceBean(in);
    }

    @Override
    public ProvinceBean[] newArray(int size) {
      return new ProvinceBean[size];
    }
  };

  @Override
  public String toString() {
    return  name ;
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

  public ArrayList<CityBean> getCityList() {
    return cityList;
  }

  public void setCityList(ArrayList<CityBean> cityList) {
    this.cityList = cityList;
  }


  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(id);
    dest.writeString(name);
    dest.writeTypedList(cityList);
  }
}
