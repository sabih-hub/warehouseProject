package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);
        String line = StdIn.readLine();
        int numberOfLines = Integer.parseInt(line);
        Warehouse w = new Warehouse();
        for(int i = 0; i < numberOfLines; i++)
        {
            line = StdIn.readLine();
            int j = 0;
            String temp = "";
            for(j = 0; line.charAt(j) != ' '; j++)
            {
                temp += line.charAt(j);
            }
            int day = Integer.parseInt(temp);
            temp = "";
            for(j++; line.charAt(j) != ' '; j++)
            {
                temp += line.charAt(j);
            }
            int id = Integer.parseInt(temp);
            temp = "";
            for(j++; line.charAt(j) != ' '; j++)
            {
                temp += line.charAt(j);
            }
            String name = temp;
            temp = "";
            for(j++; line.charAt(j) != ' '; j++)
            {
                temp += line.charAt(j);
            }
            int stock = Integer.parseInt(temp);
            temp = "";
            for(j++; j < line.length(); j++)
            {
                temp += line.charAt(j);
            }
            int demand = Integer.parseInt(temp);
            w.addProduct(id, name, stock, day, demand);
        }
        StdOut.print(w);
    }
}
