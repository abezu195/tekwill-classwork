package md.tekwill.classwork.constructors;

// POJO - Plain Old Java Object
public class Phone {
    private String model;
    private String company;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            this.weight = weight;
            System.out.println("Weight cannot be negative!");
            return;
        }
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() > 10) {
            System.out.println("Model name cannot be longer than 10 characters!");
            return;
        }
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company.length() > 20) {
            System.out.println("Company name cannot be longer than 10 characters!");
            return;
        }
        this.company = company;
    }

    public void modifyVal(int weight) {
        int anotherWeight = 100;
        weight = anotherWeight;
    }

}
