package com.tehtävä9;

import java.util.ArrayList;

public interface ListConverter {
    String convert(ArrayList arrayList);
}

class afterOne implements ListConverter {

    public String convert(ArrayList arrayList) {

        String s = "";

        for (Object o : arrayList) {
            s += o.toString() + "\n";
        }
        return s;
    }
}
class afterTwo implements ListConverter {

    public String convert(ArrayList arrayList) {
        String s = "";

        int n = 0;
        for (Object o : arrayList) {
            s += o.toString() + " ";
            n = n + 1;
            if (n == 2) {
                s = s + "\n";
                n = 0;
            }
        }

        return s;
    }
}
class afterThree implements ListConverter {

    public String convert(ArrayList arrayList) {
        String s = "";

        int n = 0;
        for (Object o : arrayList) {
            s += (o.toString() + " ");
            n = n + 1;
            if (n == 3) {
                s = s + "\n";
                n = 0;
            }
        }

        return s;
    }
}
