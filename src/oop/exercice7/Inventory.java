package oop.exercice7;

import java.util.*;

public class Inventory {

    public void run(Scanner scanner) {

        // We store all items in an ArrayList
        ArrayList<Item> items = new ArrayList<>();

        System.out.println("Enter items as '[name] [quantity]'. Type STOP to finish.");

        // We keep reading until the user types STOP
        while (true) {
            System.out.print("Enter item: ");
            String input = scanner.nextLine();

            if (input.equals("STOP")) {
                break;
            }

            // We parse the input manually, find the space and split name/quantity
            int spaceIndex = input.indexOf(' ');
            if (spaceIndex == -1) {
                System.out.println("Invalid format. Use: name quantity");
                continue;
            }

            String name = input.substring(0, spaceIndex);
            int quantity = Integer.parseInt(input.substring(spaceIndex + 1));
            items.add(new Item(name, quantity));
        }

        // Convert to HashSet to get unique names
        HashSet<String> uniqueNames = new HashSet<>();
        for (Item item : items) {
            uniqueNames.add(item.getName());
        }
        System.out.println("\n--- Unique names (HashSet) ---");
        System.out.println(uniqueNames);

        // HashMap: total quantity per name
        HashMap<String, Integer> totalQuantity = new HashMap<>();
        for (Item item : items) {
            // If name already exists, add to existing quantity, otherwise start at 0
            totalQuantity.put(item.getName(),
                    totalQuantity.getOrDefault(item.getName(), 0) + item.getQuantity());
        }
        System.out.println("\n--- Total quantity per name (HashMap) ---");
        for (Map.Entry<String, Integer> entry : totalQuantity.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Iteration 1: classic for loop
        System.out.println("\n--- Classic for loop ---");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Item at index " + i + ": " + items.get(i));
        }

        // Iteration 2: enhanced for loop
        System.out.println("\n--- Enhanced for loop ---");
        for (Item item : items) {
            System.out.println("Found item: " + item);
        }

        // Iteration 3: Iterator,  also removes items with quantity = 0
        System.out.println("\n--- Iterator (removing items with quantity = 0) ---");
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getQuantity() == 0) {
                System.out.println("Removing item with quantity 0: " + item);
                iterator.remove();
            } else {
                System.out.println("Keeping item: " + item);
            }
        }

        System.out.println("\n--- Final list after removal ---");
        System.out.println(items);
    }
}