/**
 *
 */

public final class JavaBean {
    private String firstName;
    private String lastName;
    private int age;

    private JavaBean() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public final class Builder  {
        private JavaBean jb = new JavaBean();
        public JavaBean.Builder setFirstName(final String firstName) {
            jb.firstName = firstName;
            return this;
        }
        public JavaBean.Builder setLastName(final String lastName) {
            jb.lastName = lastName;
            return this;
        }
        public JavaBean.Builder setAge(int age) {
            jb.age = age;
            return this;
        }
        public JavaBean build() {
            return jb;
        }

    }
}
