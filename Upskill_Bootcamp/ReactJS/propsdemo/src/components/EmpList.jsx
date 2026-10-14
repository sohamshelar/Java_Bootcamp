
export default function EmpList(props){
    return(
        <>
            <div>
                {props.name.map((n)=><p key={n.id}>{n.id+"  "+n.pname}<button>Delete</button></p>)}
            </div>
        </>
    )
}
