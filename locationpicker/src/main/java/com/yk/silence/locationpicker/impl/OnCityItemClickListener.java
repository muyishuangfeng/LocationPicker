package com.yk.silence.locationpicker.impl;


import com.yk.silence.locationpicker.model.CityBean;
import com.yk.silence.locationpicker.model.DistrictBean;
import com.yk.silence.locationpicker.model.ProvinceBean;

public abstract class OnCityItemClickListener {

    /**
     * 当选择省市区三级选择器时，需要覆盖此方法
     */
    public void onSelected(ProvinceBean province, CityBean city, DistrictBean district) {

    }

    /**
     * 取消
     */
    public void onCancel() {

    }
}
