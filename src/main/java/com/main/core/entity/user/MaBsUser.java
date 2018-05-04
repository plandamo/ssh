package com.main.core.entity.user;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MA_BS_USER")
public class MaBsUser implements Serializable{

  /**
   * 用户主键
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "PK_USER",unique = true,nullable = false)
  private long pkUser;
  /**
   * 年龄
   */
  @Column(name = "AGE")
  private long age;
  /**
   * 生日
   */
  @Column(name = "BIRTHDATE",length = 255)
  private String birthdate;

  @Column(name = "CARD_ID" , length = 255)
  private String cardId;

  @Column(name = "CORP_NAME" , length = 255)
  private String corpName;

  @Column(name = "CREATION_TIME" , length = 255)
  private String creationTime;

  @Column(name = "CREATOR" , length = 255)
  private String creator;

  @Column(name = "CREATOR_ID")
  private long creatorId;

  @Column(name = "DEPT_NAME" , length = 255)
  private String deptName;

  @Column(name = "EDUCATION" , length = 255)
  private long education;

  @Column(name = "EMAIL" , length = 255)
  private String email;

  @Column(name = "IS_DELETE")
  private long isDelete;

  @Column(name = "JOINSYS_DATE" , length = 255)
  private String joinsysDate;
  /**
   * 登录名
   */
  @Column(name = "LOING_ID" , length = 255)
  private String loingId;

  @Column(name = "MAJOR")
  private long major;

  @Column(name = "MENDER" , length = 255)
  private String mender;

  @Column(name = "MENDER_ID")
  private long menderId;

  @Column(name = "MOBILE")
  private String mobile;

  @Column(name = "MODIFICATION_TIME" , length = 255)
  private String modificationTime;

  @Column(name = "NOTE" , length = 255)
  private String note;

  @Column(name = "OFFICE_PHONE" , length = 255)
  private String officePhone;
  /**
   * 密码
   */
  @Column(name = "PASSWORD",length = 255)
  private String password;

  @Column(name = "PHOTO" , length = 255)
  private String photo;

  @Column(name = "RK_CORP")
  private long rkCorp;

  @Column(name = "RK_DEPT")
  private long rkDept;

  @Column(name = "SEX")
  private long sex;
  /**
   * 姓名
   */
  @Column(name = "USER_NAME" , length = 255)
  private String userName;


  public long getPkUser() {
    return pkUser;
  }

  public void setPkUser(long pkUser) {
    this.pkUser = pkUser;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }


  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  public String getCorpName() {
    return corpName;
  }

  public void setCorpName(String corpName) {
    this.corpName = corpName;
  }


  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public long getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(long creatorId) {
    this.creatorId = creatorId;
  }


  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }


  public long getEducation() {
    return education;
  }

  public void setEducation(long education) {
    this.education = education;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public long getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(long isDelete) {
    this.isDelete = isDelete;
  }


  public String getJoinsysDate() {
    return joinsysDate;
  }

  public void setJoinsysDate(String joinsysDate) {
    this.joinsysDate = joinsysDate;
  }


  public String getLoingId() {
    return loingId;
  }

  public void setLoingId(String loingId) {
    this.loingId = loingId;
  }


  public long getMajor() {
    return major;
  }

  public void setMajor(long major) {
    this.major = major;
  }


  public String getMender() {
    return mender;
  }

  public void setMender(String mender) {
    this.mender = mender;
  }


  public long getMenderId() {
    return menderId;
  }

  public void setMenderId(long menderId) {
    this.menderId = menderId;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getModificationTime() {
    return modificationTime;
  }

  public void setModificationTime(String modificationTime) {
    this.modificationTime = modificationTime;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public String getOfficePhone() {
    return officePhone;
  }

  public void setOfficePhone(String officePhone) {
    this.officePhone = officePhone;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }


  public long getRkCorp() {
    return rkCorp;
  }

  public void setRkCorp(long rkCorp) {
    this.rkCorp = rkCorp;
  }


  public long getRkDept() {
    return rkDept;
  }

  public void setRkDept(long rkDept) {
    this.rkDept = rkDept;
  }


  public long getSex() {
    return sex;
  }

  public void setSex(long sex) {
    this.sex = sex;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public String toString() {
    return "MaBsUser{" +
            "pkUser=" + pkUser +
            ", age=" + age +
            ", birthdate='" + birthdate + '\'' +
            ", cardId='" + cardId + '\'' +
            ", corpName='" + corpName + '\'' +
            ", creationTime='" + creationTime + '\'' +
            ", creator='" + creator + '\'' +
            ", creatorId=" + creatorId +
            ", deptName='" + deptName + '\'' +
            ", education=" + education +
            ", email='" + email + '\'' +
            ", isDelete=" + isDelete +
            ", joinsysDate='" + joinsysDate + '\'' +
            ", loingId='" + loingId + '\'' +
            ", major=" + major +
            ", mender='" + mender + '\'' +
            ", menderId=" + menderId +
            ", mobile='" + mobile + '\'' +
            ", modificationTime='" + modificationTime + '\'' +
            ", note='" + note + '\'' +
            ", officePhone='" + officePhone + '\'' +
            ", password='" + password + '\'' +
            ", photo='" + photo + '\'' +
            ", rkCorp=" + rkCorp +
            ", rkDept=" + rkDept +
            ", sex=" + sex +
            ", userName='" + userName + '\'' +
            '}';
  }
}
