package com.satna.service;

import java.util.List;

import com.satna.model.Home;
import com.satna.model.HomeCategory;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
