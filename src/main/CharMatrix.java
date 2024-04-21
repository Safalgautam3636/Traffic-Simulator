
package main;


import Shared.Constants;

public class CharMatrix
    {
        public char[][] map = new char[Constants.CharMapSize][];

        public CharMatrix()
        {
            for (int i = 0; i < Constants.CharMapSize; i++)
            {
                map[i] = new char[Constants.CharMapSize];
                for (int j = 0; j < Constants.CharMapSize; j++) map[i][j] = ' ';
            }
        }
    }