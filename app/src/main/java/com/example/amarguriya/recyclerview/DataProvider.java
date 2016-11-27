package com.example.amarguriya.recyclerview;

/**
 * Created by AmaRguRiyA on 27-11-2016.
 */

public class DataProvider {

    private int img_res;
    private String name,edu;

    public DataProvider(int img_res,String name,String edu)
    {
        this.img_res=img_res;
        this.name=name;
        this.edu=edu;
    }

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }
}
