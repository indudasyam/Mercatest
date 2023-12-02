package base;

import java.util.HashMap;

public class PageUrls {
        private static HashMap<String,String> pageURLs=new HashMap<>();
        private static void setPageURLs(){

                pageURLs.put("Landing Page","https://www.saucedemo.com/");
                pageURLs.put("Products Page","https://www.saucedemo.com/inventory.html");

        }
        public static String getPageUrl(String pageName){
                setPageURLs();
                return pageURLs.get(pageName);
        }



}
