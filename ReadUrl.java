import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.*;

public class Main {

    static class Cell {
        int x;
        int y;
        char ch;

        Cell(int x, char ch, int y) {
            this.x = x;
            this.y = y;
            this.ch = ch;
        }
    }

    public static void printSecretMessage(String url) {

        List<Cell> cells = new ArrayList<>();

        try {

         
            Document doc = Jsoup.connect(url).get();
       
            
            Elements rows = doc.select("table tr");

            for (int i = 1; i < rows.size(); i++) {

                Element row = rows.get(i);

                Elements cols = row.select("td");

                if (cols.size() < 3) {
                    continue;
                }

                int x = Integer.parseInt(cols.get(0).text().trim());

                char ch = cols.get(1).text().trim().charAt(0);

                int y = Integer.parseInt(cols.get(2).text().trim());

                cells.add(new Cell(x, ch, y));
            }

            
            int maxX = 0;
            int maxY = 0;

            for (Cell c : cells) {
                maxX = Math.max(maxX, c.x);
                maxY = Math.max(maxY, c.y);
            }


            char[][] grid = new char[maxY + 1][maxX + 1];

            for (int i = 0; i <= maxY; i++) {
                Arrays.fill(grid[i], ' ');
            }

            
            for (Cell c : cells) {
                grid[c.y][c.x] = c.ch;
            }

            
            for (int i = 0; i <= maxY; i++) {

                for (int j = 0; j <= maxX; j++) {
                    System.out.print(grid[i][j]);
                }

                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String url =
                "https://docs.google.com/document/d/e/2PACX-1vSvM5gDlNvt7npYHhp_XfsJvuntUhq184By5xO_pA4b_gCWeXb6dM6ZxwN8rE6S4ghUsCj2VKR21oEP/pub";

        printSecretMessage(url);
    }
}