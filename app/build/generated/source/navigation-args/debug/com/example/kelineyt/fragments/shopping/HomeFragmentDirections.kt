package com.example.kelineyt.fragments.shopping

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.kelineyt.R
import com.example.kelineyt.`data`.Product
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToProductDetailsFragment(
    public val product: Product
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_productDetailsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Product::class.java)) {
          result.putParcelable("product", this.product as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Product::class.java)) {
          result.putSerializable("product", this.product as Serializable)
        } else {
          throw UnsupportedOperationException(Product::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToProductDetailsFragment(product: Product): NavDirections =
        ActionHomeFragmentToProductDetailsFragment(product)
  }
}
