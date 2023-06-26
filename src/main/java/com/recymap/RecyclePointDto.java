package com.recymap;

public class RecyclePointDto {
    String geom;
    int pointId;
    String address;
    String title;

    public RecyclePointDto(String geom, int pointId, String address, String title) {
        this.geom = geom;
        this.pointId = pointId;
        this.address = address;
        this.title = title;
    }


    @Override
    public String toString() {
        return "RecyclePointDto{" +
                "geom='" + geom + '\'' +
                ", pointId=" + pointId +
                ", address='" + address + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
