/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Risina
 */
@Entity
@Table(name = "store_dvd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StoreDvd.findAll", query = "SELECT s FROM StoreDvd s"),
    @NamedQuery(name = "StoreDvd.findByStoreDvdId", query = "SELECT s FROM StoreDvd s WHERE s.storeDvdId = :storeDvdId"),
    @NamedQuery(name = "StoreDvd.findByStoreDvdTitle", query = "SELECT s FROM StoreDvd s WHERE s.storeDvdTitle = :storeDvdTitle"),
    @NamedQuery(name = "StoreDvd.findByStoredvdreleasedYear", query = "SELECT s FROM StoreDvd s WHERE s.storedvdreleasedYear = :storedvdreleasedYear"),
    @NamedQuery(name = "StoreDvd.findByStoreDvdActors", query = "SELECT s FROM StoreDvd s WHERE s.storeDvdActors = :storeDvdActors"),
    @NamedQuery(name = "StoreDvd.findByStoreDvdRating", query = "SELECT s FROM StoreDvd s WHERE s.storeDvdRating = :storeDvdRating"),
    @NamedQuery(name = "StoreDvd.findByStoreDvdFormat", query = "SELECT s FROM StoreDvd s WHERE s.storeDvdFormat = :storeDvdFormat"),
    @NamedQuery(name = "StoreDvd.findByStoreDvdAddedDate", query = "SELECT s FROM StoreDvd s WHERE s.storeDvdAddedDate = :storeDvdAddedDate"),
    @NamedQuery(name = "StoreDvd.findByStoreDvdModifiedDate", query = "SELECT s FROM StoreDvd s WHERE s.storeDvdModifiedDate = :storeDvdModifiedDate")})
public class StoreDvd implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "store_dvd_id")
    private Long storeDvdId;
    @Basic(optional = false)
    @Column(name = "store_dvd_title")
    private String storeDvdTitle;
    @Column(name = "store_dvd_releasedYear")
    private String storedvdreleasedYear;
    @Column(name = "store_dvd_actors")
    private String storeDvdActors;
    @Column(name = "store_dvd_rating")
    private String storeDvdRating;
    @Column(name = "store_dvd_format")
    private String storeDvdFormat;
    @Column(name = "store_dvd_added_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date storeDvdAddedDate;
    @Column(name = "store_dvd_modified_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date storeDvdModifiedDate;
    @JoinColumn(name = "store_dvd_added_employee_id", referencedColumnName = "store_employee_id")
    @ManyToOne(optional = false)
    private StoreEmployee storeDvdAddedEmployeeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "storeDvdId")
    private Collection<StoreDvdCopy> storeDvdCopyCollection;

    public StoreDvd() {
    }

    public StoreDvd(Long storeDvdId) {
        this.storeDvdId = storeDvdId;
    }

    public StoreDvd(Long storeDvdId, String storeDvdTitle) {
        this.storeDvdId = storeDvdId;
        this.storeDvdTitle = storeDvdTitle;
    }

    public Long getStoreDvdId() {
        return storeDvdId;
    }

    public void setStoreDvdId(Long storeDvdId) {
        this.storeDvdId = storeDvdId;
    }

    public String getStoreDvdTitle() {
        return storeDvdTitle;
    }

    public void setStoreDvdTitle(String storeDvdTitle) {
        this.storeDvdTitle = storeDvdTitle;
    }

    public String getStoredvdreleasedYear() {
        return storedvdreleasedYear;
    }

    public void setStoredvdreleasedYear(String storedvdreleasedYear) {
        this.storedvdreleasedYear = storedvdreleasedYear;
    }

    public String getStoreDvdActors() {
        return storeDvdActors;
    }

    public void setStoreDvdActors(String storeDvdActors) {
        this.storeDvdActors = storeDvdActors;
    }

    public String getStoreDvdRating() {
        return storeDvdRating;
    }

    public void setStoreDvdRating(String storeDvdRating) {
        this.storeDvdRating = storeDvdRating;
    }

    public String getStoreDvdFormat() {
        return storeDvdFormat;
    }

    public void setStoreDvdFormat(String storeDvdFormat) {
        this.storeDvdFormat = storeDvdFormat;
    }

    public Date getStoreDvdAddedDate() {
        return storeDvdAddedDate;
    }

    public void setStoreDvdAddedDate(Date storeDvdAddedDate) {
        this.storeDvdAddedDate = storeDvdAddedDate;
    }

    public Date getStoreDvdModifiedDate() {
        return storeDvdModifiedDate;
    }

    public void setStoreDvdModifiedDate(Date storeDvdModifiedDate) {
        this.storeDvdModifiedDate = storeDvdModifiedDate;
    }

    public StoreEmployee getStoreDvdAddedEmployeeId() {
        return storeDvdAddedEmployeeId;
    }

    public void setStoreDvdAddedEmployeeId(StoreEmployee storeDvdAddedEmployeeId) {
        this.storeDvdAddedEmployeeId = storeDvdAddedEmployeeId;
    }

    @XmlTransient
    public Collection<StoreDvdCopy> getStoreDvdCopyCollection() {
        return storeDvdCopyCollection;
    }

    public void setStoreDvdCopyCollection(Collection<StoreDvdCopy> storeDvdCopyCollection) {
        this.storeDvdCopyCollection = storeDvdCopyCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (storeDvdId != null ? storeDvdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StoreDvd)) {
            return false;
        }
        StoreDvd other = (StoreDvd) object;
        if ((this.storeDvdId == null && other.storeDvdId != null) || (this.storeDvdId != null && !this.storeDvdId.equals(other.storeDvdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "store.StoreDvd[ storeDvdId=" + storeDvdId + " ]";
    }
    
}
