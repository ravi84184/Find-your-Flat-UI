package devsnik.com.findyourflat;

import java.util.ArrayList;

import devsnik.com.findyourflat.model.ApartmentModel;

public class Constants {
    public static String sourceRobotoRegular = "fonts/Roboto-Regular.ttf";
    public static String sourceRobotoBold = "fonts/Roboto-Bold.ttf";
    public static String sourceRobotoLight = "fonts/RobotoCondensed-Light.ttf";


    public static ArrayList<ApartmentModel> getList() {
        ArrayList<ApartmentModel> list = new ArrayList<>();

        list.add(new ApartmentModel("Hillom Apartment", "₹5399", "120", R.drawable.a));
        list.add(new ApartmentModel("Satva Apartment", "₹3000", "120", R.drawable.b));
        list.add(new ApartmentModel("Hari Apartment", "₹5699", "120", R.drawable.c));
        list.add(new ApartmentModel("Devi Apartment", "₹4800", "120", R.drawable.a));
        list.add(new ApartmentModel("Star Apartment", "₹3400", "120", R.drawable.c));


        return list;
    }

}
