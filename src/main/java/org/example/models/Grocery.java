package org.example.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class Grocery {
    public static ArrayList<String> groceryList=new ArrayList<>();



    Scanner scanner=new Scanner(System.in);
    public void setGroceryList(){
        int choice;
        do{
            System.out.println("Yapilmak istenen operasyonu seciniz.0=cikis,1= ekle,2=cikar");
    choice=scanner.nextInt();
    scanner.nextLine();
        }while(choice!=0){
            switch (choice){
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String itemsToAdd=scanner.nextLine();
                    addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    String itemsToRemove=scanner.nextLine();
                    addItems(itemsToRemove);
                    break;
            }

        }
        while(choice!=0);
        //Important!!!
        scanner.close();
    }
        private void addItems(String itemstoAdd){
    String[] splitItems=itemstoAdd.split(",");
        for(String item:splitItems){
            item=item.trim();
            if(checkItemsInList(item)){
                System.out.println("girilen item listede mevcut"+ item);
            }else{
                groceryList.add(item);
            }
        }
    }
        private boolean checkItemsInList(String item){
        return groceryList.contains(item);
        }
        private void removeItems(String itemsToRemove) {
            String[] splitItems = itemsToRemove.split(",");
            for (String item : splitItems) {
                item = item.trim();

                if (checkItemsInList(item)) {
                    groceryList.remove(item);
                } else {
                    System.out.println("boyle bir urun listede yok" + item);
                }

            }
        }

        public static void printToSorted(){
            sortItems();
            System.out.println("Mevcut liste");
            for(String item:groceryList){
                System.out.println(item);
            }
        }

        private static void sortItems(){
            Collections.sort(groceryList);
        }
    }
