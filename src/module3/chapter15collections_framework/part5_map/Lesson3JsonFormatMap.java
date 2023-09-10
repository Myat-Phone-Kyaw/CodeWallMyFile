package module3.chapter15collections_framework.part5_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson3JsonFormatMap {
    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<>();

        Map<String, Object> map1 = new HashMap<>();
        map1.put("rate", 4.5);
        map1.put("count", 146);

//        System.out.println(map1);

        Map<String, Object> map = new HashMap<>();
        map.put("id", 19);
        map.put("title", "Opna Women's Short Sleeve Moisture");
        map.put("price", 7.95);
        map.put("description", "100% Polyester, Machine wash, 100% cationic polyester interlock, Machine Wash & Pre Shrunk for a Great Fit, Lightweight, roomy and highly breathable with moisture wicking fabric which helps to keep moisture away, Soft Lightweight Fabric with comfortable V-neck collar and a slimmer fit, delivers a sleek, more feminine silhouette and Added Comfort");
        map.put("category", "women's clothing");
        map.put("image", "https://fakestoreapi.com/img/51eg55ulmdL._AC_UX679_-jpg");
        map.put("rating", map1);
        System.out.println(map);
    }
}
