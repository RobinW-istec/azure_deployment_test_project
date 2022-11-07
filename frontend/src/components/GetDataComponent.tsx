import {useEffect, useState} from "react";
import axios from "axios";

export const GetDataComponent = () => {
    const [data, setData] = useState();
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState();

    useEffect(() => {
        axios.get('http://localhost:8080/api/data', {
            headers: {'Access-Control-Allow-Origin': '*'}
        })
            .then(response => setData(response.data))
            .catch(error => {
                console.log("Error fetching: " , error);
                setError(error);
            })
            .finally(() => {
                setLoading(false);
            })
    },[])

    if(error) return (<>Error!</>);
    if(loading) return (<>Loading...</>);

    return(
        <div>
            {data}
        </div>
    );
}