package com.lh.entity;

public class DccCities {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dcc_cities.id
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dcc_cities.cityid
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    private String cityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dcc_cities.city
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dcc_cities.provinceid
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    private String provinceid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dcc_cities.id
     *
     * @return the value of dcc_cities.id
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dcc_cities.id
     *
     * @param id the value for dcc_cities.id
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dcc_cities.cityid
     *
     * @return the value of dcc_cities.cityid
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dcc_cities.cityid
     *
     * @param cityid the value for dcc_cities.cityid
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dcc_cities.city
     *
     * @return the value of dcc_cities.city
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dcc_cities.city
     *
     * @param city the value for dcc_cities.city
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dcc_cities.provinceid
     *
     * @return the value of dcc_cities.provinceid
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dcc_cities.provinceid
     *
     * @param provinceid the value for dcc_cities.provinceid
     *
     * @mbggenerated Wed May 01 11:04:32 CST 2019
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }
}