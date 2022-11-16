class Compute {
 public void PushAndPut(long a[],int j,int i)

    {

        long temp = a[i];

        for(int k=i;k>j;k--)

        {      a[k] = a[k-1];

        }

       a[j] = temp;

    }  

    

    public void Rearrange(long a[], long n)

    {

        int j = -1;

        for(int i=0;i<n;i++)

        {

            if(a[i]<0)

            {

                j++;

                PushAndPut(a,j,i);

            }

        }

    }
}
