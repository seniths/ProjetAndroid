package Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Max on 05-11-15.
 */
public class Player implements Serializable {

    private Integer num;
    private String position;
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getNum() {
        return num;
    }

    public String getPosition() {
        return position;
    }

    public Player(Integer num, String position, String name, Integer age) {
        this.num = num;
        this.position = position;
        this.name = name;
        this.age = age;
    }
}
