package ua.levelup.AddressManager.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by java on 15.05.2016.
 */

@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class AddressDto {
    private String adressContent;

    public String getAdressContent() {
        return adressContent;
    }

    public void setAdressContent(String adressContent) {
        this.adressContent = adressContent;
    }
}
