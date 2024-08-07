package com.shanks.chatwiseassignment.ui.product_detail_activity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.shanks.chatwiseassignment.domain.model.Product
import com.bumptech.glide.Glide
import com.shanks.chatwiseassignment.R
import com.shanks.chatwiseassignment.databinding.ActivityProductDetailBinding

class ProductDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductDetailBinding

    @SuppressLint("StringFormatMatches")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productDetail: Product = intent.getParcelableExtra("productDetail")!!


        Glide.with(this)
            .load(productDetail.images.firstOrNull() ?: productDetail.thumbnail)
            .into(binding.productImageView)

        binding.productTitleTextView.text = productDetail.name
        binding.productDescriptionTextView.text = productDetail.description
        binding.productPriceTextView.text = getString(R.string.price_format, productDetail.price)
        binding.productRatingTextView.text = getString(R.string.rating_format, productDetail.rating)
        binding.productStockTextView.text = getString(R.string.stock_format, productDetail.stock)

        binding.productSkuTextView.text = getString(R.string.sku_format, productDetail.sku)

        binding.productDimensionsTextView.text = getString(R.string.dimensions_format,
            productDetail.dimensions.width, productDetail.dimensions.height, productDetail.dimensions.depth)
        binding.productWarrantyTextView.text = productDetail.warrantyInformation
        binding.productShippingTextView.text = productDetail.shippingInformation
        binding.productAvailabilityTextView.text = productDetail.availabilityStatus
        binding.productReturnPolicyTextView.text = productDetail.returnPolicy
    }
}
