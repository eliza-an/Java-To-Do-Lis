import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faTrash} from "@fortawesome/free-solid-svg-icons"; // Import specific icon

export default function Input() {
  return (
    <div>
      <input type="text"></input>
      <button className="delete">
      <FontAwesomeIcon icon={faTrash}  /></button>
    </div>
  );
}
