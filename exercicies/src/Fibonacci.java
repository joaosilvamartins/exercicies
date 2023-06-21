import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {

    private Integer x;
    private List<Integer> list = new ArrayList<>();

    public Fibonacci(Integer x){
        this.x = x;
    }
    
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public List<Integer> getList(){
        return list;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((x == null) ? 0 : x.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fibonacci other = (Fibonacci) obj;
        if (x == null) {
            if (other.x != null)
                return false;
        } else if (!x.equals(other.x))
            return false;
        return true;
    }

    public boolean sequence(Integer x){
        
        int sum = 0;
        int n1 = 0;
        int n2 = 1;

        getList().addAll(Arrays.asList(n1, n2));

        int answer = 0;

        while(!x.equals(n2)){
            if(n2>x){
                answer = -1;
                break;
            }
            sum = n2;
            n2 += n1;
            n1 = sum;

            getList().add(n2);
            if(x.equals(n2)){
                answer = 1;
                break;
            }
        }

        if(answer == -1){
            return false;
        }
        else{
            return true;
        }

    }
}
