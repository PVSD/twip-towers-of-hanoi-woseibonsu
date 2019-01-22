package com.company;

import java.util.ArrayList;

public class Hanoi {


    public Hanoi(){}
    public void solve(int discs, char from, char aux, char to)
    {
        if(discs == 1)
        {
            System.out.println("Move from " + from + " to " + to);
        }
        else
        {
                solve(discs-1, from, to, aux);
            System.out.println("Move from " + from + " to " + to + ".");
            solve(discs-1, aux, from, to);
        }
    }

}
