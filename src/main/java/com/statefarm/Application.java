package com.statefarm;

public class Application {
    public static void main(String[] args) {
        int sum = 0;

        for(int a = 0; a < args.length; a++) {
            int i = Integer.parseInt(args[a]);
            if(i > 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}

