/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.eclipse.openvsx.jooq.Indexes;
import org.eclipse.openvsx.jooq.Keys;
import org.eclipse.openvsx.jooq.Public;
import org.eclipse.openvsx.jooq.tables.records.JobrunrJobsRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobrunrJobs extends TableImpl<JobrunrJobsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.jobrunr_jobs</code>
     */
    public static final JobrunrJobs JOBRUNR_JOBS = new JobrunrJobs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobrunrJobsRecord> getRecordType() {
        return JobrunrJobsRecord.class;
    }

    /**
     * The column <code>public.jobrunr_jobs.id</code>.
     */
    public final TableField<JobrunrJobsRecord, String> ID = createField(DSL.name("id"), SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.jobrunr_jobs.version</code>.
     */
    public final TableField<JobrunrJobsRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.jobrunr_jobs.jobasjson</code>.
     */
    public final TableField<JobrunrJobsRecord, String> JOBASJSON = createField(DSL.name("jobasjson"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.jobrunr_jobs.jobsignature</code>.
     */
    public final TableField<JobrunrJobsRecord, String> JOBSIGNATURE = createField(DSL.name("jobsignature"), SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>public.jobrunr_jobs.state</code>.
     */
    public final TableField<JobrunrJobsRecord, String> STATE = createField(DSL.name("state"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.jobrunr_jobs.createdat</code>.
     */
    public final TableField<JobrunrJobsRecord, LocalDateTime> CREATEDAT = createField(DSL.name("createdat"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.jobrunr_jobs.updatedat</code>.
     */
    public final TableField<JobrunrJobsRecord, LocalDateTime> UPDATEDAT = createField(DSL.name("updatedat"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>public.jobrunr_jobs.scheduledat</code>.
     */
    public final TableField<JobrunrJobsRecord, LocalDateTime> SCHEDULEDAT = createField(DSL.name("scheduledat"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>public.jobrunr_jobs.recurringjobid</code>.
     */
    public final TableField<JobrunrJobsRecord, String> RECURRINGJOBID = createField(DSL.name("recurringjobid"), SQLDataType.VARCHAR(128), this, "");

    private JobrunrJobs(Name alias, Table<JobrunrJobsRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobrunrJobs(Name alias, Table<JobrunrJobsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.jobrunr_jobs</code> table reference
     */
    public JobrunrJobs(String alias) {
        this(DSL.name(alias), JOBRUNR_JOBS);
    }

    /**
     * Create an aliased <code>public.jobrunr_jobs</code> table reference
     */
    public JobrunrJobs(Name alias) {
        this(alias, JOBRUNR_JOBS);
    }

    /**
     * Create a <code>public.jobrunr_jobs</code> table reference
     */
    public JobrunrJobs() {
        this(DSL.name("jobrunr_jobs"), null);
    }

    public <O extends Record> JobrunrJobs(Table<O> child, ForeignKey<O, JobrunrJobsRecord> key) {
        super(child, key, JOBRUNR_JOBS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.JOBRUNR_JOB_CREATED_AT_IDX, Indexes.JOBRUNR_JOB_RCI_IDX, Indexes.JOBRUNR_JOB_SCHEDULED_AT_IDX, Indexes.JOBRUNR_JOB_SIGNATURE_IDX, Indexes.JOBRUNR_JOB_UPDATED_AT_IDX, Indexes.JOBRUNR_STATE_IDX);
    }

    @Override
    public UniqueKey<JobrunrJobsRecord> getPrimaryKey() {
        return Keys.JOBRUNR_JOBS_PKEY;
    }

    @Override
    public List<UniqueKey<JobrunrJobsRecord>> getKeys() {
        return Arrays.<UniqueKey<JobrunrJobsRecord>>asList(Keys.JOBRUNR_JOBS_PKEY);
    }

    @Override
    public JobrunrJobs as(String alias) {
        return new JobrunrJobs(DSL.name(alias), this);
    }

    @Override
    public JobrunrJobs as(Name alias) {
        return new JobrunrJobs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JobrunrJobs rename(String name) {
        return new JobrunrJobs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JobrunrJobs rename(Name name) {
        return new JobrunrJobs(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, Integer, String, String, String, LocalDateTime, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}