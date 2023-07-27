public interface Calci
{
int getSum(int n1, int n2)
}

class CalciImpl implements Calci
{
public int getSum(int n1, int n2)
{
return n1+n2;
}
}