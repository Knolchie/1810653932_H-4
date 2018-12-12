package com.company;

import java.util.Date;

public class Paperbook extends Book
{
  private   String series;
  private String month;

  public Paperbook (String isbn){
      super("");
  }

  public Paperbook (int pages, Date released, String title,String series,String month){
      super(pages, released,title, "000000-000000-000000");
      this.series= series;
      this.month=month;

  }



    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
