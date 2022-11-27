package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
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
            if(temp.equals("add"))
            {
                temp = "";
                for(j++; line.charAt(j) != ' '; j++)
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
            else if(temp.equals("purchase"))
            {
                temp = "";
                for(j++; line.charAt(j) != ' '; j++)
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
                for(j++; j < line.length(); j++)
                {
                    temp += line.charAt(j);
                }
                int amount = Integer.parseInt(temp);
                w.purchaseProduct(id, day, amount);
            }
            else if(temp.equals("restock"))
            {
                temp = "";
                for(j++; line.charAt(j) != ' '; j++)
                {
                    temp += line.charAt(j);
                }
                int id = Integer.parseInt(temp);
                temp = "";
                for(j++; j < line.length(); j++)
                {
                    temp += line.charAt(j);
                }
                int amount = Integer.parseInt(temp);
                w.restockProduct(id, amount);
            }
            else
            {
                temp = "";
                for(j++; j < line.length(); j++)
                {
                    temp += line.charAt(j);
                }
                int id = Integer.parseInt(temp);
                w.deleteProduct(id);
            }
        }
        StdOut.print(w);
	// Use this file to test all methods
    }
}
