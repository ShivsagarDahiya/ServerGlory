package com.satna.service;

import java.util.List;
import java.util.Optional;

import com.satna.model.Seller;
import com.satna.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
