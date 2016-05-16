package ua.levelup.AddressManager.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by java on 15.05.2016.
 */

@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class AddressDto {
    private String addressContent;
    private String phoneNumber;

    public String getAdressContent() {
        return addressContent;
    }

    public void setAdressContent(String adressContent) {
        this.addressContent = adressContent;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
