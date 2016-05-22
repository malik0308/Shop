package com.shop;


public class Shop {

    private String name;
    private String addressNumber;
    private String postCode;
    private double longitude;
    private double latitude;


    public Shop(final String name, final String addressNumber, final String postCode, final double longitude, final double latitude) {
        this.name = name;
        this.addressNumber = addressNumber;
        this.postCode = postCode;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public String getPostCode() {
        return postCode;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public static class ShopBuilder{

        private String name;
        private String addressNumber;
        private String postCode;
        private double longitude;
        private double latitude;

        public ShopBuilder(final String name, final String addressNumber,final String postCode){
            this.name = name;
            this.addressNumber = addressNumber;
            this.postCode = postCode;
        }

        public ShopBuilder withName(final String name){
            this.name = name;
            return this;
        }

        public ShopBuilder withAddressNumber(final String addressNumber){
            this.addressNumber = addressNumber;
            return this;
        }

        public ShopBuilder withPostCode(final String postCode){
            this.postCode = postCode;
            return this;
        }

        public ShopBuilder withLongitude(final double longitude){
            this.longitude = longitude;
            return this;
        }

        public ShopBuilder withLatitude(final double latitude){
            this.latitude = latitude;
            return this;
        }

        public Shop build(){
            return new Shop(name,addressNumber,postCode,longitude,latitude);
        }
    }
}
