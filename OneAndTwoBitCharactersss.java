class OneAndTwoBitCharactersss {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i<(bits.length-1))
        {
            if(bits[i]==1)
            {
                i+=2;
            }
            else
            {
                i+=1;
            }
        }
        if((i+1)==(bits.length))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}