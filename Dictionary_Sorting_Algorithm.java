import java.util.ArrayList;

public class Dictionary_Sorting_Algorithm {
    public ArrayList<String> sorted_ArrayList = new ArrayList<>();

    public ArrayList<String> StartSorting(String str){
        ArrayList<MSet> Mroot = new ArrayList<>();

        ArrayList<MSet> prev = new ArrayList<>();
        ArrayList<MSet> temp = new ArrayList<>();

        Mroot.add(new MSet());
        temp.add(new MSet());
        prev.add(new MSet());

        temp.set(0, Mroot.get(0));
        prev.set(0, Mroot.get(0));

        char[] ca= str.toCharArray();
        int aLen = ca.length;

        int Nue = 0;

        for(int i =0; i< aLen; i++){


            if (ca[i] == ' '){
                Nue=0;
                temp.get(0).Num += 1;
                System.out.print("\t\t" + temp.get(0).Num +"done\t\t");
                continue;
            }
            if (Nue==0) {

                System.out.println();
                temp.set(0, Mroot.get(0));
                prev.set(0, Mroot.get(0));

                Nue =1;

            }
            if(!temp.get(0).now.containsKey(si))
                temp.get(0).now.put(si, new MSet());


            prev.set(0, temp.get(0));
            temp.set(0, prev.get(0).now.get(si));

            System.out.print(si + "\t\t" );
            if (i == aLen-1){

                temp.get(0).Num += 1;

            }

        }


        ArrayList<String> empty =new ArrayList<>();
        empty.add("");
        recCall(Mroot,empty);

        return sorted_ArrayList;
    }

    public void recCall(ArrayList<MSet> current, ArrayList<String> sp){

        ArrayList<String> spArrTemp = new ArrayList<>();
        ArrayList<MSet> temp = new ArrayList<>();


        if(!current.isEmpty()) {

            int k =0;

            for(MSet thisc: current) {

                for (String s : thisc.now.keySet()) {
                    temp.add(thisc.now.get(s));


                    if (thisc.now.get(s).Num > 0) {
                        for (int i = 0; i < thisc.now.get(s).Num; i++)
                            sorted_ArrayList.add(sp.get(k) + s);
                    }
                    spArrTemp.add(sp.get(k) + s);

                }
                ++k;
            }

            recCall(temp, spArrTemp);

        }


    }

}
