# LocationPicker
[![](https://jitpack.io/v/muyishuangfeng/LocationPicker.svg)](https://jitpack.io/#muyishuangfeng/LocationPicker)

+ 1、第一步：在Google的build文件夹下添加依赖
 
      maven { url 'https://jitpack.io' }
      
      
+ 2、在依赖的moudle下添加依赖


       implementation 'com.github.muyishuangfeng:LocationPicker:1.0.0'
       
       
       
+ 3、代码使用



       String mDefaultProvince="陕西省";
       String mDefaultCity="西安市";
       String mDefaultDistrict="鄠邑区";
       CityConfig.WheelType mWheelType = CityConfig.WheelType.PRO_CITY_DIS;
       CityPickerView mCityPicker= new CityPickerView();
       mCityPicker.init(this);
       CityConfig cityConfig = new CityConfig.Builder()
                .title("选择城市")
                .visibleItemsCount(5)
                .province(mDefaultProvince)
                .city(mDefaultCity)
                .district(mDefaultDistrict)
                .provinceCyclic(true)
                .cityCyclic(true)
                .districtCyclic(true)
                .setCityWheelType(mWheelType)
                .setCustomItemLayout(R.layout.item_city)//自定义item的布局
                .setCustomItemTextViewId(R.id.item_city_name_tv)
                .setShowGAT(true)
                .build();

        mCityPicker.setConfig(cityConfig);
        mCityPicker.setOnCityItemClickListener(new OnCityItemClickListener() {
            @Override
            public void onSelected(ProvinceBean province, CityBean city, DistrictBean district) {
                StringBuilder sb = new StringBuilder();
                sb.append("选择的结果：\n");
                if (province != null) {
                    sb.append(province.getName()).append(" ").append(province.getId()).append("\n");
                }

                if (city != null) {
                    sb.append(city.getName()).append(" ").append(city.getId()).append("\n");
                }

                if (district != null) {
                    sb.append(district.getName()).append(" ").append(district.getId()).append("\n");
                }

                mTxtResult.setText(sb.toString());

            }

            @Override
            public void onCancel() {
            }
        });
        mCityPicker.showCityPicker();       
