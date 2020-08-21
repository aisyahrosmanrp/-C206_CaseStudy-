public class Package {
    
    private String code;
    private String description;
    private String startingDate;
    private String endingDate;
    private String amount;
    
    
    public Package(String code, String description, String startingDate, String endingDate, String amount) {
      
      this.code = code;
      this.description = description;
      this.startingDate = startingDate;
      this.endingDate = endingDate;
      this.amount = amount;
      
    }
    
    public String getCode() {
      return code;
      
    }
    
    public void setCode(String code) {
      this.code = code;
      
    }
    
    public String getDescription() {
      return code;
      
    }
    
    public void setDescription(String description) {
      this.description = description;
      
    }
    
    public String getStartDate() {
      return startingDate;
      
    }
    
    public void setStartDate(String startingDate) {
      this.startingDate = startingDate;
      
    }
    
    public String getEndDate() {
      return endingDate;
      
    }
    
    public void setEndDate(String endingDate) {
      this.endingDate = endingDate;
      
    }
    
    public String getAmount() {
      return amount;
      
    }
    
    public void setAmount(String amount) {
      this.amount = amount;
      
    }
    
    
    
  }