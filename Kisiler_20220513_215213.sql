--
-- PostgreSQL database dump
--

-- Dumped from database version 11.14
-- Dumped by pg_dump version 14.0

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

--
-- Name: kullanicilar; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.kullanicilar (
    "kullaniciNo" integer NOT NULL,
    "kullaniciAdi" character varying(35) NOT NULL,
    sifre character varying(35) NOT NULL
);


ALTER TABLE public.kullanicilar OWNER TO postgres;

--
-- Data for Name: kullanicilar; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.kullanicilar VALUES
	(2, 'ibo', 'ibo');


--
-- PostgreSQL database dump complete
--

