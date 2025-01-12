public class Student extends Object
{
    public String name;
    public byte age;
    public float rate;

    public Student(String name, int age, float rate)
    {
        this.name = name;
        this.age = (byte)age;
        this.rate = rate;
    }

    @Override
    public String toString()
    {
        return String.format("Студент {имя: %s, возраст: %d, средний балл: %.2f}",
                             this.name,
                             this.age,
                             this.rate);
    }
}
