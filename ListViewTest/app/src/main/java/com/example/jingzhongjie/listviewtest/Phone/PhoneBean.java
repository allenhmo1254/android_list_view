package com.example.jingzhongjie.listviewtest.Phone;

/**
 * Created by jingzhongjie on 17/2/6.
 */

public class PhoneBean {

    private String phoneNumber;
    private String phoneName;

    public PhoneBean(String phoneNumber, String phoneName)
    {
        setPhoneNumber(phoneNumber);
        setPhoneName(phoneName);
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public void setPhoneName(String phoneName)
    {
        this.phoneName = phoneName;
    }

    public String getPhoneName()
    {
        return this.phoneName;
    }

}
