
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.utilities.CommonFunctions;

import java.io.Serializable;
import java.util.List;

public class FacilityData implements Serializable {

    @SerializedName("Category")
    @Expose
    private List<Category> category = null;
    @SerializedName("Categoryar")
    @Expose
    private List<Category> categoryar = null;

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public List<Category> getCategoryar() {
        return categoryar;
    }

    public void setCategoryar(List<Category> categoryar) {
        this.categoryar = categoryar;
    }

    public List<Category> getCategoryList() {
        switch (CommonFunctions.lang) {
            case "ar":
                return /*(categoryar != null && categoryar.size() > 0 && categoryar.size() == category.size()) ? categoryar :*/ category;
            case "en":
            default:
                return category;

        }
    }

}
