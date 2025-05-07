package BOOK_STORE;
import java.util.Date;

public class MemberShipCard {
    private int memberShipCardId;
    private Date issueDate;
    private Date expDate;
    private int points;

    // Constructor
    public MemberShipCard(int memberShipCardId, Date issueDate, Date expDate, int points) {
        this.memberShipCardId = memberShipCardId;
        this.issueDate = issueDate;
        this.expDate = expDate;
        this.points = points;
    }

    // Getters
    public int getMemberShipCardId() {
        return memberShipCardId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public int getPoints() {
        return points;
    }

    // Setters
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
