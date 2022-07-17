package com.jap.recursivefunction;

public class EcommerceWebsite {
   public static int countTags(int itemsf, int tags)
    {

        if (itemsf<=9)
        {
			return tags;
		}

		else
		{
			tags=countTags((itemsf-10),tags+1);
		}

		return tags;
		
    }
    public static int countTotalItemsPurchasedIncludingFreeItem(int amount,int priceOfEachItem, int tags)
    {
		tags=0;
        int noOfitems=amount/priceOfEachItem;
		int free=countTags(noOfitems,tags);
        return noOfitems+free;

    }

    public static void main (String[] args)
    {
        // total money to be spent
        int amount=0;
        //  cost of each item
        int priceOfEachItem=0;
        // no of tags exchanged for one free item.
      int tags=0;
        System.out.println("The total number of items (purchased + free items) : "+countTotalItemsPurchasedIncludingFreeItem(amount , priceOfEachItem, tags));
    }


}
