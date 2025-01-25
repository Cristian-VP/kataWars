import java.util.*;

public class StockList {

    public static int countAmmountCategory (String[] library, String category){
        int stockCategory = 0;
        for(String ammountBooks : library){
            if(ammountBooks.startsWith(category)){
                int quantity = Integer.valueOf(ammountBooks.replaceAll("^([A-Z]{3,})(\\s)(\\d+)$", "$3"));
                stockCategory += quantity;
            }
        }
        return stockCategory;
    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";

        HashMap<String, Integer> categoriesStock = new HashMap<>();
        StringBuilder queryCategoryStock = new StringBuilder();

        for(String ammountBooks : lstOfArt){
            String booksClassified = ammountBooks.substring(0,ammountBooks.indexOf(' '));
            String categoryBook = ""+booksClassified.charAt(0);
            categoriesStock.put(categoryBook, countAmmountCategory(lstOfArt, categoryBook));
        }

        for(int i=0; i < lstOf1stLetter.length; i++){
            String category = lstOf1stLetter[i];
            int quantity = (categoriesStock.containsKey(category)) ? categoriesStock.get(category) : 0;
            String outputFormat = String.format(" (%S : %d) %s", category, quantity, (i < lstOf1stLetter.length-1 && lstOf1stLetter.length > 1 ) ? "-" : "");
            queryCategoryStock.append(outputFormat);
        }

        return String.valueOf(queryCategoryStock).trim();
    }
}