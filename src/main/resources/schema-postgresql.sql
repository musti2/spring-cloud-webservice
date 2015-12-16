--
-- PostgreSQL database dump
--
​
-- Dumped from database version 9.4.4
-- Dumped by pg_dump version 9.4.4
-- Started on 2015-12-16 16:47:20
​
SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
​
--
-- TOC entry 180 (class 3079 OID 11855)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: -
--
​
CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
​
​
--
-- TOC entry 2037 (class 0 OID 0)
-- Dependencies: 180
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: -
--
​
COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
​
​
SET search_path = public, pg_catalog;
​
--
-- TOC entry 181 (class 1255 OID 24944)
-- Name: update_modified_column(); Type: FUNCTION; Schema: public; Owner: -
--
​
CREATE FUNCTION update_modified_column() RETURNS trigger
    LANGUAGE plpgsql
    AS $$
BEGIN
    NEW.modified = clock_timestamp();
    RETURN NEW;	
END;
$$;
​
​
SET default_with_oids = false;
​
--
-- TOC entry 173 (class 1259 OID 25299)
-- Name: ncr; Type: TABLE; Schema: public; Owner: -
--
​
CREATE TABLE ncr (
    id integer NOT NULL,
    created timestamp with time zone DEFAULT clock_timestamp() NOT NULL,
    modified timestamp with time zone,
    ncr_num character varying(40),
    ncr_creation date,
    area character varying(50),
    status_code character varying(1),
    status_desc character varying(25),
    sales_order_num character varying(10)
);
​
​
--
-- TOC entry 172 (class 1259 OID 25297)
-- Name: ncr_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--
​
CREATE SEQUENCE ncr_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
​
​
--
-- TOC entry 2038 (class 0 OID 0)
-- Dependencies: 172
-- Name: ncr_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--
​
ALTER SEQUENCE ncr_id_seq OWNED BY ncr.id;
​
​
--
-- TOC entry 179 (class 1259 OID 25511)
-- Name: operation; Type: TABLE; Schema: public; Owner: -
--
​
CREATE TABLE operation (
    id integer NOT NULL,
    created timestamp with time zone DEFAULT clock_timestamp() NOT NULL,
    modified timestamp with time zone,
    work_order_num character varying(20),
    operation_seq_num numeric,
    operation_desc character varying(200),
    required_hours numeric,
    actual_hours numeric,
    time_remaining numeric,
    resource_id numeric,
    start_date date,
    completion_date date,
    operation_completed boolean,
    operation_status character varying(20),
    sso_list character varying(9)[],
    name_list character varying(80)[]
);
​
​
--
-- TOC entry 178 (class 1259 OID 25509)
-- Name: operation_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--
​
CREATE SEQUENCE operation_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
​
​
--
-- TOC entry 2039 (class 0 OID 0)
-- Dependencies: 178
-- Name: operation_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--
​
ALTER SEQUENCE operation_id_seq OWNED BY operation.id;
​
​
--
-- TOC entry 175 (class 1259 OID 25488)
-- Name: sales_order; Type: TABLE; Schema: public; Owner: -
--
​
CREATE TABLE sales_order (
    id integer NOT NULL,
    created timestamp with time zone DEFAULT clock_timestamp() NOT NULL,
    modified timestamp with time zone,
    sales_order_num character varying(20),
    sales_order_creation_date date,
    project_num character varying(10),
    customer character varying(50),
    item_category character varying(20),
    ordered_item_num character varying(20),
    gate1_scheduled_start_date date,
    gate1_actual_start_date date,
    gate1_scheduled_end_date date,
    gate1_actual_end_date date,
    gate1q_scheduled_start_date date,
    gate1q_actual_start_date date,
    gate1q_scheduled_end_date date,
    gate1q_actual_end_date date,
    gate2_scheduled_start_date date,
    gate2_actual_start_date date,
    gate2_scheduled_end_date date,
    gate2_actual_end_date date,
    gate3_scheduled_start_date date,
    gate3_actual_start_date date,
    gate3_scheduled_end_date date,
    gate3_actual_end_date date,
    current_gate character varying(3),
    required_repair_completion_date date,
    earliest_possible_end_date date,
    inspection_work_order_num character varying(20),
    repair_work_order_num character varying(20),
    sales_order_status character varying(20)
);
​
​
--
-- TOC entry 174 (class 1259 OID 25486)
-- Name: sales_order_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--
​
CREATE SEQUENCE sales_order_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
​
​
--
-- TOC entry 2040 (class 0 OID 0)
-- Dependencies: 174
-- Name: sales_order_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--
​
ALTER SEQUENCE sales_order_id_seq OWNED BY sales_order.id;
​
​
--
-- TOC entry 177 (class 1259 OID 25498)
-- Name: work_order; Type: TABLE; Schema: public; Owner: -
--
​
CREATE TABLE work_order (
    id integer NOT NULL,
    created timestamp with time zone DEFAULT clock_timestamp() NOT NULL,
    modified timestamp with time zone,
    work_order_num character varying(20),
    sales_order_num character varying(20),
    org_id numeric,
    start_date date,
    completion_date date,
    work_order_desc character varying(200),
    machine character varying(20),
    component character varying(30),
    cell character varying(25),
    work_order_type_code character varying(2),
    ncr_status boolean,
    otd_date date,
    required_total_hours numeric,
    actual_total_hours numeric,
    time_remaining_total_hours numeric,
    work_order_status character varying(40)
);
​
​
--
-- TOC entry 176 (class 1259 OID 25496)
-- Name: work_order_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--
​
CREATE SEQUENCE work_order_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
​
​
--
-- TOC entry 2041 (class 0 OID 0)
-- Dependencies: 176
-- Name: work_order_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--
​
ALTER SEQUENCE work_order_id_seq OWNED BY work_order.id;
​
​
--
-- TOC entry 1902 (class 2604 OID 25302)
-- Name: id; Type: DEFAULT; Schema: public; Owner: -
--
​
ALTER TABLE ONLY ncr ALTER COLUMN id SET DEFAULT nextval('ncr_id_seq'::regclass);
​
​
--
-- TOC entry 1908 (class 2604 OID 25514)
-- Name: id; Type: DEFAULT; Schema: public; Owner: -
--
​
ALTER TABLE ONLY operation ALTER COLUMN id SET DEFAULT nextval('operation_id_seq'::regclass);
​
​
--
-- TOC entry 1904 (class 2604 OID 25491)
-- Name: id; Type: DEFAULT; Schema: public; Owner: -
--
​
ALTER TABLE ONLY sales_order ALTER COLUMN id SET DEFAULT nextval('sales_order_id_seq'::regclass);
​
​
--
-- TOC entry 1906 (class 2604 OID 25501)
-- Name: id; Type: DEFAULT; Schema: public; Owner: -
--
​
ALTER TABLE ONLY work_order ALTER COLUMN id SET DEFAULT nextval('work_order_id_seq'::regclass);
​
​
--
-- TOC entry 1911 (class 2606 OID 25305)
-- Name: ncr_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--
​
ALTER TABLE ONLY ncr
    ADD CONSTRAINT ncr_pkey PRIMARY KEY (id);
​
​
--
-- TOC entry 1917 (class 2606 OID 25520)
-- Name: operation_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--
​
ALTER TABLE ONLY operation
    ADD CONSTRAINT operation_pkey PRIMARY KEY (id);
​
​
--
-- TOC entry 1913 (class 2606 OID 25494)
-- Name: sales_order_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--
​
ALTER TABLE ONLY sales_order
    ADD CONSTRAINT sales_order_pkey PRIMARY KEY (id);
​
​
--
-- TOC entry 1915 (class 2606 OID 25507)
-- Name: work_order_pk; Type: CONSTRAINT; Schema: public; Owner: -
--
​
ALTER TABLE ONLY work_order
    ADD CONSTRAINT work_order_pk PRIMARY KEY (id);
​
​
--
-- TOC entry 1918 (class 2620 OID 25306)
-- Name: trg_ncr_update; Type: TRIGGER; Schema: public; Owner: -
--
​
CREATE TRIGGER trg_ncr_update BEFORE UPDATE ON ncr FOR EACH ROW EXECUTE PROCEDURE update_modified_column();
​
​
--
-- TOC entry 1921 (class 2620 OID 25521)
-- Name: trg_operation_update; Type: TRIGGER; Schema: public; Owner: -
--
​
CREATE TRIGGER trg_operation_update BEFORE UPDATE ON operation FOR EACH ROW EXECUTE PROCEDURE update_modified_column();
​
​
--
-- TOC entry 1919 (class 2620 OID 25495)
-- Name: trg_sales_order_update; Type: TRIGGER; Schema: public; Owner: -
--
​
CREATE TRIGGER trg_sales_order_update BEFORE UPDATE ON sales_order FOR EACH ROW EXECUTE PROCEDURE update_modified_column();
​
​
--
-- TOC entry 1920 (class 2620 OID 25508)
-- Name: trg_work_order_update; Type: TRIGGER; Schema: public; Owner: -
--
​
CREATE TRIGGER trg_work_order_update BEFORE UPDATE ON work_order FOR EACH ROW EXECUTE PROCEDURE update_modified_column();
​
​
-- Completed on 2015-12-16 16:47:21
​
--
-- PostgreSQL database dump complete
--