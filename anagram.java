static boolean isAnagram(String a, String b) {
      a=a.toLowerCase();
        b=b.toLowerCase();
        char array[]=a.toCharArray();
        char array1[]=b.toCharArray();

        if(a.length()!=b.length())
        {
            return false;
        }
        

        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<b.length();j++)
            {
                    if(a.charAt(i)==b.charAt(j))
                    {
                        array[i]=array1[j]=0;
                        //System.out.println(array[i]);
                    }
                   
            }

        }
        for(int i=0;i<a.length();i++)
        {
                if(array[i]!=0 || array1[i]!=0)
                {
                    return false;
                }             
        }
        return true;
    }
